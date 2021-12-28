//Pergunta 1
//In the game "Cats of Catthulhu" a cat is described by:
//
//
//  a Name;
//
//
//a Role;
//
//
//a Background; and
//
//
//a Description.
//
//
//A Name is any text. Cats are not constrained by the usual conventions of human names.
//
//
//  Role is one of Catcrobat, Pussyfoot, Scraper, Tiger Dreamer, or Twofootologist
//
//
//Background consists of:
//
//
//  a Lifestyle, which is one of Feral, Housecat, or Showcat;
//
//
//a description of Hunting experience, which is free text; and
//
//
//any other text that is relevant.
//
//
//Description is free text.



enum Role {
  case Catcrobat, Pussyfoot, Scraper, TigerDreamer, Twofootologist
}

enum Lifestyle {
  case Feral, Housecat, Showcat
}

case class Background(lifestyle: Lifestyle, description: String)


case class Cat(name: String, role: Role, background: Background, description: String)
