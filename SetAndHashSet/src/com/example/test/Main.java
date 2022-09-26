package com.example.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	// write your code here
     HeavenlyBody temp = new Planet("Mercury",88);
     solarSystem.put(temp.getKey(),temp);
     planets.add(temp);

     temp = new Planet("Venus",225);
     solarSystem.put(temp.getKey(),temp);
     planets.add(temp);

     temp = new Planet("Earth",365);
     solarSystem.put(temp.getKey(),temp);
     planets.add(temp);

     HeavenlyBody tempMoon = new Moon("Moon",27);
     solarSystem.put(temp.getKey(), tempMoon);
//     temp.addMoon(tempMoon);

        System.out.println("Planets");
        for (HeavenlyBody planet:planets){
            System.out.println("\t"+planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mercury", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of "+body.getKey());
        for(HeavenlyBody jupiterMoon: body.getSatellites()){
            System.out.println("\t"+jupiterMoon.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet:planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon:moons){
            System.out.println("\t"+moon.getKey());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto",842);
        planets.add(pluto);

        for(HeavenlyBody planet:planets){
            System.out.println(planet);
//            System.out.println(planet.getKey()+": "+planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth",365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(),pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The solar system contains:");
        for(HeavenlyBody heavenlyBody:solarSystem.values()){
            System.out.println(heavenlyBody);
        }
    }



}
