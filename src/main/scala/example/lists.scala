package example

import common._

object Lists {
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
  def sum(myList: List[Long]): Long = ???

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
  def max(myList: List[Long]): Long = ???
  
  /**
   * Ecrire une methode qui renverse une liste.
   * @param   myList une liste de nombres
   * @return  liste avec l'ordre des elements inverses
   */
  def revert(myList: List[Long]): List[Long] = ???
  
  /**
   * Ecrire une methode qui renvoie la fusion de 2 listes de nombres sans redondance.
   * @param   listA une liste de nombres
   * @param   listB une liste de nombres
   * @return  funsion des 2 listes
   */
  def merge(listA: List[Long], listB: List[Long]): List[Long] = ???

}