public class SomeName {

  public SomeName() {
    printSomething("hei");
    printSomething(getText("hehe"));
  }

  public void printSomething(String something) {
    System.out.println(something);
  }

  public String getText(String text) {
    return text;
  }

  public void what() {
    System.out.println("wazzaaaaaaa");
  }

  public int Calculate(int number1, int number2) {
    return number1 + number2;
  }

}
