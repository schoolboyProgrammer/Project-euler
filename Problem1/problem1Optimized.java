class problem1Optimized {
  public static long sum(int n) {
    return (n * (n + 1) / 2);
  }

  public static void main(String[] args) {
    int lastindex = 1000 - 1;
    int num[] = {3, 5, -15};
    int summultiples = 0;
    for (int i : num) {
      summultiples += i * sum((int)(lastindex / Math.abs(i)));
    }
    System.out.println(summultiples);
  }
}