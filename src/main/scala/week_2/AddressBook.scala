package week_2

object AddressBook {
  case class Contact(
                    name: String,
                    email: String,
                    phoneNumbers: List[String]
                    )
  case class AddressBook(contacts: Contact)
  
}
