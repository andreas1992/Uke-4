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

}
