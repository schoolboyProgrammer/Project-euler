class problem1BruteForce{
  public static void main(String[] args) {
    long summultiples = 0;
    for (int i = 0; i < 1000; i++) {
      if(i % 3 == 0 || i % 5 == 0) {
        summultiples += i;
      }
      else {
        continue;
      }
    }

    System.out.println(summultiples);
  }
}