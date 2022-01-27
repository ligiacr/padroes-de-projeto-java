package me.dio;

import me.dio.facade.Facade;
import me.dio.implementacao.*;
import me.dio.singleton.SingletonEager;
import me.dio.singleton.SingletonLazy;
import me.dio.singleton.SingletonLazyHolder;
import me.dio.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Lígia", "00000000");

        //Implementação - strategy

        Atitude alegre = new AtitudeAlegre();
        Atitude desconfiada = new AtitudeDesconfiada();
        Atitude triste = new AtitudeTriste();

        Cachorro cachorro = new Cachorro();
        cachorro.setAtitude(alegre);
        cachorro.latir();
        cachorro.latir();
        cachorro.latir();

        cachorro.setAtitude(desconfiada);
        cachorro.latir();
        cachorro.latir();

        cachorro.setAtitude(triste);
        cachorro.latir();
    }
}
