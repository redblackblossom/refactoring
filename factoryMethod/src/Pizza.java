public abstract class Pizza {
    public void prepare(){}
    public void bake(){}
    public void cut(){}
    public void box(){}
}

class NYStyleCheesePizza extends Pizza{}
class NYStyleVeggiePizza extends Pizza{}
class NYStyleClamPizza extends Pizza{}
class NYStylePepperoniPizza extends Pizza{}

class ChicagoStyleCheesePizza extends Pizza{}
class ChicagoStyleVeggiePizza extends Pizza{}
class ChicagoStyleClamPizza extends Pizza{}
class ChicagoStylePepperoniPizza extends Pizza{}