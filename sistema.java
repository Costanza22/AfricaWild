import java.util.HashMap;
import java.util.Map;

public class SistemaChipagemAnimais {

    private Map<String, Animal> animais;

    public SistemaChipagemAnimais() {
        animais = new HashMap<>();
    }

    public void adicionarAnimal(String especie, String reino, String alimentacao, String comportamento) {
        String chipagem = gerarNumeroChipagem();
        Animal animal = new Animal(especie, reino, alimentacao, comportamento, chipagem);
        animais.put(chipagem, animal);
    }

    public Animal buscarAnimalPorChipagem(String chipagem) {
        return animais.get(chipagem);
    }

    private String gerarNumeroChipagem() {
        // Lógica para gerar um número de chipagem único
        // Pode ser implementado de acordo com as necessidades do sistema
        // Neste exemplo, estamos utilizando uma numeração sequencial
        int numeroChipagem = animais.size() + 1;
        return String.format("%04d", numeroChipagem); // Formata o número com zeros à esquerda
    }

    public static void main(String[] args) {
        SistemaChipagemAnimais sistema = new SistemaChipagemAnimais();

        sistema.adicionarAnimal("Hipopotamo", "Animal", "Herbívoro", "Semi-aquático");
        sistema.adicionarAnimal("Hiena", "Animal", "Carnívoro", "Social");
        sistema.adicionarAnimal("Gnu", "Animal", "Herbívoro", "Migratório");
        sistema.adicionarAnimal("Mabeco", "Animal", "Carnívoro", "Solitário");
        sistema.adicionarAnimal("Zebra", "Animal", "Herbívoro", "Migratório");
        sistema.adicionarAnimal("Leão", "Animal", "Carnívoro", "Social");
        sistema.adicionarAnimal("Elefante", "Animal", "Herbívoro", "Grupal");
        sistema.adicionarAnimal("Leopardo", "Animal", "Carnívoro", "Solitário");
        sistema.adicionarAnimal("Rinoceronte", "Animal", "Herbívoro", "Solitário");
        sistema.adicionarAnimal("Girafa", "Animal", "Herbívoro", "Grupal");

        // Exemplo de busca de animal por chipagem
        Animal animal = sistema.buscarAnimalPorChipagem("0001");
        if (animal != null) {
            System.out.println("Animal encontrado: " + animal);
        } else {
            System.out.println("Animal não encontrado");
        }
    }
}

class Animal {
    private String especie;
    private String reino;
    private String alimentacao;
    private String comportamento;
    private String chipagem;

    public Animal(String especie, String reino, String alimentacao, String comportamento, String chipagem) {
        this.especie = especie;
        this.reino = reino;
        this.alimentacao = alimentacao;
        this.comportamento = comportamento;
        this.chipagem = chipagem;
    }

    public String getEspecie() {
        return especie;
    }

    public String getReino() {
        return reino;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getComportamento() {
        return comportamento;
    }

    public String getChipagem() {
        return chipagem;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", reino='" + reino + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", comportamento='" + comportamento + '\'' +
                ", chipagem='" + chipagem + '\'' +
                '}';
    }
}
