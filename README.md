# TD2 Listes et fonctions sur les listes


Le but de ce TD est d'implémenter quelque methodes
* Une qui permet de calculer la somme de tous les éléments d’une liste de nombres. 
* Une qui renvoie le plus grand élément contenu dans une liste de nombres.
* Une qui renverse une liste
* Une qui fusionne 2 listes sans redondance

## Installation
* Télécharger le [**ZIP**](https://github.com/poussard/scala-TD2/archive/master.zip)
* Décompresser le
* Importer le comme 'existing Project' dans eclipse ( File --> import --> General --> existing projects into workspace)

## Liste des fichiers

    src
    |- main
    |  |- scala
    |  |  |- common
    |  |  |  |- package.scala
    |  |  |- exemple
    |  |  |  |- lists.scala          // Méthodes à implémenter
    |- test
    |  |- scala
    |  |  |- exemple
    |  |  |  |- listsTests.scala     // Tests à implémenter
    
## Exercise
* Dissection des listes
    * Exécutez ses différentes instructions, et regardez les différents types retourne
	```scala
	val list = List(1,2,3)
	list.tail
	list.init
	list.head
	list.last
	```
    * Implémenter les methodes du fichier lists.scala
    * Implémenter et/ou corriger les fonctions de test du fichier listsUnitTests 

## Scala doc List

<div style="text-align:left;">
<table>
<tr>
    <th align="left">List()</th><th align="left">Creates an empty List</th>
</tr>
<tr>
    <th align="left">Nil</th><th align="left">Creates an empty List</th>
</tr>
<tr>
    <th align="left">List("Cool", "tools", "rule")</th><th align="left">Creates a new List[String] with the three values "Cool", "tools", and "rule"</th>
</tr>
<tr>
    <th align="left">val thrill = "Will" :: "fill" :: "until" :: Nil</th><th align="left">Creates a new List[String] with the three values "Will", "fill", and "until"</th>
</tr>
<tr>
    <th align="left">thrill(2)</th><th align="left">Returns the 2nd element (zero based) of the thrill List (returns "until")</th>
</tr>
<tr>
    <th align="left">thrill.drop(2)</th><th align="left">Returns the thrill List without its first 2 elements (returns List("until"))</th>
</tr>
<tr>
    <th align="left">thrill.foreach(s => print(s))</th><th align="left">Executes the print statement on each of the Strings in the thrill List (prints "Willfilluntil")</th>
</tr>
<tr>
    <th align="left">thrill.foreach(print)</th><th align="left">Same as the previous, but more concise (also prints "Willfilluntil")</th>
</tr>
<tr>
    <th align="left">thrill.head</th><th align="left">Returns the first element in the thrill List (returns "Will")</th>
</tr>
<tr>
    <th align="left">thrill.init</th><th align="left">Returns a List of all but the last element in the thrill List (returns List("Will", "fill"))</th>
</tr>
<tr>
    <th align="left">thrill.isEmpty</th><th align="left">Indicates whether the thrill List is empty (returns false)</th>
</tr>
<tr>
    <th align="left">thrill.last</th><th align="left">Returns the last element in the thrill List (returns "until")</th>
</tr>
<tr>
    <th align="left">thrill.length</th><th align="left">Returns the number of elements in the thrill List (returns 3)</th>
</tr>
<tr>
    <th align="left">thrill.tail</th><th align="left">Returns the thrill List minus its first element (returns List("fill", "until"))</th>
</table>
</div>
