package jdbc.test;

import jdbc.classes.Comprador;
import jdbc.db.CompradorDBOLD;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        deletar();
//        atualizar();
//        List<Comprador> listaComprador =  selecionarTudo();
//        List<Comprador> listaComprador2 =  buscarPorNome("ria");
//        System.out.println(listaComprador);
//        System.out.println(listaComprador2);
//        CompradorDB.selectMetaData();]
//        CompradorDB.checkDriverStatus();
//        CompradorDB.testTypeScroll();
//        CompradorDB.updateNomesToLowerCase();
//        System.out.println(CompradorDB.searchByNamePreparedStatement("oao"));
//        CompradorDB.updatePreparedStatement(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));
//        System.out.println(CompradorDB.searchByNameCallableStatement("%oao"));
//        System.out.println(CompradorDB.searchByNameRowSet("%oao"));
//        CompradorDB.updateRowSet(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));
//        CompradorDB.updateRowSetCached(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));
        try {
            CompradorDBOLD.saveTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-11", "Priscila");
        CompradorDBOLD.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.000.000-11", "MARIA");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
