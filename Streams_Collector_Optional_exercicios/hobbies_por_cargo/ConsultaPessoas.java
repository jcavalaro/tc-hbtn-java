import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        /*
        nome do cargo como chave do TreeMap e um TreeSet de pessoas daquele cargo como valor do TreeMap.ok
A lista de cargos do TreeMap deve estar em ordem reversa.
*/
        TreeMap<String, TreeSet<Pessoa>> treemap =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Collections.reverseOrder()), Collectors.toCollection(TreeSet::new)
                        ));
        return treemap;

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        Map<String, Long> map =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));

        return map;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas){

        Map<String, Map<Integer, Long>> map =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));

        return map;
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
        Map<String, Double> map =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));

        return map;
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoas){
        Map<String, TreeSet<String>> map =
                pessoas.stream()
                        .collect(groupingBy(Pessoa::getCargo, Collectors.flatMapping(l -> l.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));


        // que contém o nome do cargo como chave do primeiro Map - ok
        //e um conjunto de hobbies das pessoas daquele cargo.

        return map;
    }
}
