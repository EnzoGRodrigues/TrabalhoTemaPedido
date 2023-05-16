package br.edu.ifrs.pw1.util;

import br.edu.ifrs.pw1.pessoas.Cliente;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ClienteComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        String nome1 = o1.getNome();
        String nome2 = o2.getNome();

        return nome1.compareTo(nome2);
    }

    @Override
    public Comparator<Cliente> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Cliente> thenComparing(Comparator<? super Cliente> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Cliente> thenComparing(Function<? super Cliente, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Cliente> thenComparing(Function<? super Cliente, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Cliente> thenComparingInt(ToIntFunction<? super Cliente> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Cliente> thenComparingLong(ToLongFunction<? super Cliente> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Cliente> thenComparingDouble(ToDoubleFunction<? super Cliente> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
