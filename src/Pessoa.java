public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRG() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    private String nome;
    private Integer rg;

    public Pessoa(String nome, int rg) {
        this.setNome(nome);
        this.setRg(rg);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa)obj;
        return this.getRG() == pessoa.getRG();
    }
}
