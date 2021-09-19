public class Dicionario {
    //constructor
    public Dicionario() {
        DoublyLinkedList<String>[] arr = new DoublyLinkedList[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = new DoublyLinkedList<String>();
            arr[i].insert(String.valueOf((char) (i + 65)));
        }
        this.dicionario = arr;
    }

    //atributos
    private DoublyLinkedList<String>[] dicionario;

    //metodos
    public void add(String palavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        String novaPalavra = palavra.toUpperCase().charAt(0) + palavra.substring(1);
        dicionario[indice].insert(novaPalavra);
    }

    public boolean contains(String palavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        return dicionario[indice].search(palavra);
    }

    public void remove(String palavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        dicionario[indice].remove(palavra);
    }

    //index of palavra
    public int indexOf(String palavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        return dicionario[indice].indexOf(palavra);
    }

    //print specific palavra
    public void print(String palavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        dicionario[indice].print(palavra);
    }

    public void print() {
        for (int i = 0; i < 26; i++) {
            System.out.println(dicionario[i]);
        }
    }

    //update specific palavra
    public void update(String palavra, String novaPalavra) {
        int indice = palavra.toUpperCase().charAt(0) - 'A';
        dicionario[indice].update(palavra, novaPalavra);
    }

    //count palavras
    public int count() {
        if(this.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += dicionario[i].size();
        }
        return count;
    }

    //if all elements of array arr have only one element return true
    public boolean isEmpty() {
        for (int i = 0; i < 26; i++) {
            if (dicionario[i].size() != 1) {
                return false;
            }
        }
        return true;
    }

}