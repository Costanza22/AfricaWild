#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Classe Animal
class Animal {
protected:
    string nome;
    string reino;
    string alimentacao;
    string comportamento;
    int numeroChip;

public:
    Animal(string nome, string reino, string alimentacao, string comportamento, int numeroChip) {
        this->nome = nome;
        this->reino = reino;
        this->alimentacao = alimentacao;
        this->comportamento = comportamento;
        this->numeroChip = numeroChip;
    }

    virtual void exibirDados() {
        cout << "Nome: " << nome << endl;
        cout << "Reino: " << reino << endl;
        cout << "Alimentação: " << alimentacao << endl;
        cout << "Comportamento: " << comportamento << endl;
        cout << "Número de Chipagem: " << numeroChip << endl;
    }
};

// Classe Hipopotamo
class Hipopotamo : public Animal {
public:
    Hipopotamo(int numeroChip) : Animal("Hipopotamo", "Animalia", "Herbívoro", "Semi-aquático", numeroChip) {}
};

// Classe Hiena
class Hiena : public Animal {
public:
    Hiena(int numeroChip) : Animal("Hiena", "Animalia", "Carnívoro", "Cacador", numeroChip) {}
};

// Classe Gnu
class Gnu : public Animal {
public:
    Gnu(int numeroChip) : Animal("Gnu", "Animalia", "Herbívoro", "Migratório", numeroChip) {}
};

// Classe Mabeco
class Mabeco : public Animal {
public:
    Mabeco(int numeroChip) : Animal("Mabeco", "Animalia", "Carnívoro", "Solitário", numeroChip) {}
};

// Classe Zebra
class Zebra : public Animal {
public:
    Zebra(int numeroChip) : Animal("Zebra", "Animalia", "Herbívoro", "Gregarious", numeroChip) {}
};

// Classe Leão
class Leao : public Animal {
public:
    Leao(int numeroChip) : Animal("Leao", "Animalia", "Carnívoro", "Social", numeroChip) {}
};

// Classe Elefante
class Elefante : public Animal {
public:
    Elefante(int numeroChip) : Animal("Elefante", "Animalia", "Herbívoro", "Matriarcal", numeroChip) {}
};

// Classe Leopardo
class Leopardo : public Animal {
public:
    Leopardo(int numeroChip) : Animal("Leopardo", "Animalia", "Carnívoro", "Solitário", numeroChip) {}
};

// Classe Rinoceronte
class Rinoceronte : public Animal {
public:
    Rinoceronte(int numeroChip) : Animal("Rinoceronte", "Animalia", "Herbívoro", "Solitário", numeroChip) {}
};

// Classe Girafa
class Girafa : public Animal {
public:
    Girafa(int numeroChip) : Animal("Girafa", "Animalia", "Herbívoro", "Gregarious", numeroChip) {}
};

int main() {
    vector<Animal*> animais;
    animais.push_back(new Hipopotamo(1001));
    animais.push_back(new Hiena(1002));