class Dummy {

  private Dummy() {}

  static Dummy create() {
    return new Dummy();
  }

  int max(final int pLeft, final int pRight) {
    if (pLeft < pRight) {
      return pRight;
    } else {
      return pLeft;
    }
  }
}
