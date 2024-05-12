import java.util.Scanner;

public class ArvoreBinaria {
  static class BIntNo {
    double valor;
  
    BIntNo esq, dir;
    BIntNo(double valor) {
      this.valor = valor;
      esq = dir = null;
    }
  }

  BIntNo raiz;
  ArvoreBinaria() {
    raiz = null;
  }

  BIntNo inserir(BIntNo no, double valor) {
    if (no == null) {
      return new BIntNo(valor);
    }
    if (valor < no.valor) {
      no.esq = inserir(no.esq, valor);
    } else if (valor > no.valor) {
      no.dir = inserir(no.dir, valor);
    }
    return no;
}

  void inserirNo(double valor) {
    raiz = inserir(raiz, valor);
  }

  void exibirEsquerdo(BIntNo no) {
    if (no != null) {
      exibirEsquerdo(no.esq);
      System.out.print(no.valor + " ");
    }
  }

  void exibirNoEsq() {
    exibirEsquerdo(raiz);
  }

  void exibirDireito(BIntNo no) {
    if (no != null) {
      System.out.print(no.valor + " ");
      exibirDireito(no.dir);
    }
  }

  void exibirNoDir() {
    exibirDireito(raiz);
  }

  void exibirRaiz() {

    System.out.println("Raiz: " + raiz.valor);
  }

  void exibirNo() {
    exibirNoEsq();
    exibirRaiz();
    exibirNoDir();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArvoreBinaria arv = new ArvoreBinaria();
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "o número: ");
      double num = sc.nextDouble();
      arv.inserirNo(num);
    }
    arv.exibirNo();
  }
}
