package example

import common._

object listsFun {
  /**
   * Ecrire une methode qui permet de calculer la somme de tous les elements de la liste `myList`.
   * il y a plusieurs techniques qui peuvent etre utilisees  pour mettre en oeuvre cette methode
   *
   * Pour cet exemple, vous pouvez utiliser les methodes  presente dans la
   * classe `List`:
   *
   *   - myList.isEmpty : Boolean
   *          retourne  true si la liste `myList` est vide
   *   - myList.head    : Long
   *          retourne  le premier element de la liste `myList`.Si la liste est vide une exception est levée
   *   - myList.tail    : List[Long]
   *          retourne  la queue de la liste `myList`, i.e. la liste `myList` sans son element de tete
   *
   * Astuce: au lieu d'écrire une  boucle `for` ou `while`, penser à une solution recursive
   *
   * @param   myList une liste de nombres
   * @return  la somme de tous les éléments de la liste `myList`
   */
  def sum(myList: List[Long]): Long = {
    myList match {
      case firstElem :: tail => firstElem + sum(tail) // if there is an element, add it to the sum of the tail
      case Nil => 0 // if there are no elements, then the sum is 0
    }
  }

  /**
   * Ecrire une methode qui renvoie le plus grand element contenu dans une liste de nombres.
   * Si la liste `myList` est vide, elle leve un `java.util.IllegalArgumentException`.
   * On peut utiliser les memes methodes que ci-dessus.
   *
   * Astuce: Encore une fois, penser à une solution recursive au lieu d'utiliser des constructions en boucle.
   *         Vous pourriez avoir besoin de définir une methodes auxiliaire.
   *
   * @param   myList une liste de nombres
   * @return  le plus grand element de la liste `myList`
   * @throws  java.util.IllegalArgumentException si `myList` est une liste vide
   */
  def max(myList: List[Long]): Long = {
    if (myList.isEmpty) throw new IllegalArgumentException

    if (myList.length == 1)
      myList.head
    else
      max(myList.head, max(myList.tail))
  }

  def max(curValue: Long, curMax: Long): Long = {
    if (curValue > curMax) curValue
    else curMax
  }

  /**
   * Ecrire une methode qui renverse une liste.
   * @param   myList une liste de nombres
   * @return  liste avec l'ordre des elements inverses
   */
  def revert(myList: List[Long]): List[Long] = myList match {
    case Nil => Nil
    case _ => myList.last :: revert(myList.init)
  }

  /**
   * Ecrire une methode qui renvoie la fusion de 2 listes de nombres sans redondance.
   * @param   listA une liste de nombres
   * @param   listB une liste de nombres
   * @return  funsion des 2 listes
   */
  def merge(listA: List[Long], listB: List[Long]): List[Long] = {
      if(listB.isEmpty) listA
      else (merge(listA, listB.tail) :+ listB.head).distinct
  }

  /**
   * Ecrire une methode qui aplatit une liste. List(1, List(2, 3), 4) donnera List(1, 2, 3, 4 )
   * Any est le type parent de tout les types et tout les objets
   *
   * @param   list une liste de liste
   * @return  la liste aplatit
   */
  def aplatir(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case (elem: List[Any]) :: tail => aplatir(elem) ::: aplatir(tail)
    case (elem: Any) :: tail => elem :: aplatir(tail)
  }
}
