package com.company.item6;

public interface T1 {
  int VALUE = 1;
  void m();
}

 interface T2 {
  int VALUE = 2;
  void m();
}


  class TestCase implements T1, T2  {
    @Override
    public void m() {
    }
  }
