package Day17.structuralDesignPattern;

interface ExpensiveObject {
    void process();
}

class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing Done");
    }

    public void heavyInitialConfiguration() {
        System.out.println("Loading the initial heavy Configuration");
    }
}

class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObjectImpl ob;

    @Override
    public void process() {
        if (ob == null) {
            ob = new ExpensiveObjectImpl();
        }
        ob.process();
    }
}


public class ProxyEx {
    public static void main(String[] args) {
        ExpensiveObject o = new ExpensiveObjectProxy();
        o.process(); // Initializing
        o.process(); // Already initialized, so this will not repeat the initialization
    }
}
