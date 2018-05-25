object CaseClass {

  def chooseClass(obj: AnyRef) =
    obj match {
      case obj:Manager => obj.raisePayment()
      case obj:Granny => obj.knit()
      case obj:Developer => obj.work()
    }

  case class Manager(payment: Int) {
    def raisePayment(): Int =
      payment + 1
  }

  case class Developer(project: String) {
    def work(): String =
      "I am work with " + project
  }

  case class Granny(something: String) {
    def knit(): String =
      "I am knit " + something
  }
}
