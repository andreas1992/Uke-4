public class SomeName {

  public static void main(String[] args) {
    SomeName someName = new SomeName();
    someName.printSomething("hei");
    someName.printSomething(someName.getText("hehe"));
  }

  public void printSomething(String something) {
    System.out.println(something);
  }

  public String getText(String text) {
    return text;
  }

}
