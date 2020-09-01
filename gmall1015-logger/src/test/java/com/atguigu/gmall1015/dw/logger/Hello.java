package com.atguigu.gmall1015.dw.logger;

import static java.lang.System.*;

/**
 * @auther hage
 * @creat 2020-09-01 14:55
 */
class A {
static {
out.print("1");

}
public A() {
 out.print("2");
}
}
class B extends A{
static {
out.print("a");
}
 public B() {
out.print("b");
}
}
public class Hello {
public static void main(String[] args) {
 A ab = new B();
 ab = new B();
}
}