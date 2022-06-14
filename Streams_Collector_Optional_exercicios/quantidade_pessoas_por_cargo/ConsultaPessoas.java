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

}
