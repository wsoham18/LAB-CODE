package test;

interface Fly {
    void Spacecrafts();
}

class Airplane implements Fly {
    public void Spacecrafts() {
        System.out.println("This is an Airplane");
    }
}

class Helicopter implements Fly {
    public void Spacecrafts() {
        System.out.println("This is a Helicopter");
    }
}

class Cargo implements Fly {
    public void Spacecrafts() {
        System.out.println("This is a Cargo");
    }
}

class Flyingobject {
    public static void main(String[] args) {
    	
        Airplane a1 = new Airplane();
        Helicopter h1 = new Helicopter();
        Cargo c1 = new Cargo();

        a1.Spacecrafts();
        h1.Spacecrafts();
        c1.Spacecrafts();
        System.out.println("This is all about Spacecrafts...");
    }
}
