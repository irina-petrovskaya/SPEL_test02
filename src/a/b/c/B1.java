package a.b.c;

import java.util.List;

/**
 * Created by Irina.Petrovskaya on 5/29/13.
 */
public class B1 {
    private MyType1.InnerEnum1 inner1;
    private String inner2;
    private List<B2> b2s;

    public List<B2> getB2s() {
        return b2s;
    }

    public void setB2s(List<B2> b2sArg) {
        b2s = b2sArg;
    }



    public void setInner2(String inner2) {
        this.inner2 = inner2;
    }

    public String getInner2() {
        return inner2;
    }

    public MyType1.InnerEnum1 getInner1() {
        return inner1;
    }

    public void setInner1(MyType1.InnerEnum1 inner1Arg) {
        inner1 = inner1Arg;
    }
}
