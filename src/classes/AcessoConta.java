package classes;

public class AcessoConta extends Conta {
    private Usuario usuario;

    public AcessoConta(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getDados() {
        if (usuarioPermitido()) {
            return super.getDados();
        }

        return new String("\nUsuário não cadastrado!");
    }

    public boolean usuarioPermitido() {
        return usuario.getCpf() == "123.456.789-10" && usuario.getSenha() == 123; 
    }
}
