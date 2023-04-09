package org.example.LambdaExpressions;

interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(12,13);
        System.out.println("Return value is: " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block ...");
        int value = e.execute("Hello");
        System.out.println("Return value is: " + value);
    }
}
public class LambdaExpressionsDemo {

    public static void main(String[] args) {
        int c = 100;
        // mustn't do this; c = 8;
        int d = 77;

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello There.");
                // Can do this in methods of anonymous classes int d = 8;
                return  a + b + c;
            }
        });
        System.out.println("=======================");

        runner.run((a,b) ->  {

            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        } );
        System.out.println("=======================");

        Executable ex = (a,b) ->{
            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        };
        runner.run(ex);

        Object codeblock = (Executable)(a,b) -> {
            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        };
    }
}
