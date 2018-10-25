public class Orcamento {
private double valor;
public Orcamento(double valor) {
this.valor = valor;
}
public double getValor() {
return valor;
}
}

public class Imposto {
public Imposto() {
}
public double calcula(Orcamento orcamento) {
System.out.println("teste");
return orcamento.getValor() * 0.1;
}
}