package HackerRank;
public class Single {

        private static Single single = new Single( );

        /* A private Constructor prevents any other
         * class from instantiating.
         */
        private Single() { }

        /* Static 'instance' method */
        public static Single getInstance( ) {
            return single;
        }

        /* Other methods protected by singleton-ness */
        protected static void demoMethod( ) {
            System.out.println("demoMethod for singleton");
        }
    }

    interface A{
     public abstract void printB();
    }
    interface B {
        public abstract void printB();
    }
    interface  C extends A,B{
        public abstract void printB();
    }
    class D implements C{

        @Override
        public void printB() {

        }
    }