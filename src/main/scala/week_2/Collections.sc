case class Contact(
                    name: String,
                    email: String,
                    phoneNumbers: List[String]
                  )

case class AddressBook(contacts: List[Contact])


val alice = Contact(name = "Alice", email = "alice@gmail.comm", phoneNumbers = List("99999999"))
val bob = Contact(name = "Bob", email = "bob@gmail.com", phoneNumbers = List("8783274923"))
val addressBook = AddressBook(List(alice, bob))

val numberOfContacts: Int = addressBook.contacts.length
val isAliceInContacts: Boolean = addressBook.contacts.contains(alice)
val contactNames: List[String] = addressBook.contacts.map(contact => contact.name)


val a = (contact: Contact) => contact.email.endsWith("@google.com")

val square = (x: Int) => x * x

val xs: List[Int] = List(1, 2, 3, 43)
def greaterThanFortyTwo(x: Int): Boolean = x > 42
xs.filter(greaterThanFortyTwo)
xs.filter(x => x > 42)


val contacts1 = List(alice, bob)
val carol: Contact = Contact(name = "Carol", email = "carol@gmail.com", phoneNumbers = List("999999999"))
val contacts2 = carol :: contacts1


addressBook.contacts match {
  case first :: tail => first.name
  case _ => println("Empty list")
}

addressBook.contacts.head.name
addressBook.contacts(0).name

import scala.collection.mutable

val buffer = mutable.ArrayBuffer(1, 2, 3)
val emptyBuffer = mutable.ArrayBuffer.empty[Int]

val map = Map("a" -> true, "e" -> true, "b" -> false)

val tuple: (String, Int) = ("rafa", 42)
val (x, y) = (1, 2)
x
y

Map.empty[String, Int] + ("a" -> 1) + ("b" -> 2)

