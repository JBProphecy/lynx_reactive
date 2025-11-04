package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxMap
{
  private JaxMap() { throw JaxForbiddenConstructorException.create(JaxMap.class); }

  public static <K, V> Map<K, V> require(Map<K, V> map) {
    return JaxEntity.require(map, Map.class);
  }

  public static <K, V> Map<K, V> require(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    return JaxEntity.require(map, mapType);
  }

  public static <K, V> boolean checkIsEmpty(Map<K, V> map) {
    JaxMap.require(map);
    return map.isEmpty();
  }

  public static <K, V> boolean checkIsEmpty(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.isEmpty();
  }

  public static <K, V> boolean checkIsNotEmpty(Map<K, V> map) {
    JaxMap.require(map);
    return !map.isEmpty();
  }

  public static <K, V> boolean checkIsNotEmpty(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return !map.isEmpty();
  }

  public static <K, V> boolean checkIsKeyPresent(Map<K, V> map, K key) {
    JaxMap.require(map);
    return map.containsKey(key);
  }

  public static <K, V> boolean checkIsKeyPresent(Map<K, V> map, K key, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.containsKey(key);
  }

  public static <K, V> boolean checkIsKeyAbsent(Map<K, V> map, K key) {
    JaxMap.require(map);
    return !map.containsKey(key);
  }

  public static <K, V> boolean checkIsKeyAbsent(Map<K, V> map, K key, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return !map.containsKey(key);
  }

  public static <K, V> int getSize(Map<K, V> map) {
    JaxMap.require(map);
    return map.size();
  }

  public static <K, V> int getSize(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.size();
  }

  public static <K, V> Set<K> getKeys(Map<K, V> map) {
    JaxMap.require(map);
    return map.keySet();
  }

  public static <K, V> Set<K> getKeys(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.keySet();
  }

  public static <K, V> Collection<V> getValues(Map<K, V> map) {
    JaxMap.require(map);
    return map.values();
  }

  public static <K, V> Collection<V> getValues(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.values();
  }

  public static <K, V> Set<Entry<K, V>> getEntries(Map<K, V> map) {
    JaxMap.require(map);
    return map.entrySet();
  }

  public static <K, V> Set<Entry<K, V>> getEntries(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.entrySet();
  }

  public static <K, V> V getValue(Map<K, V> map, K key) {
    JaxMap.require(map);
    return map.get(key);
  }

  public static <K, V> V getValue(Map<K, V> map, K key, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.get(key);
  }

  public static <K, V> V put(Map<K, V> map, K key, V value) {
    JaxMap.require(map);
    return map.put(key, value);
  }

  public static <K, V> V put(Map<K, V> map, K key, V value, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.put(key, value);
  }

  public static <K, V> V put(Map<K, V> map, Entry<K, V> entry) {
    JaxMap.require(map);
    JaxMapEntry.require(entry);
    return map.put(entry.getKey(), entry.getValue());
  }

  public static <K, V> V put(Map<K, V> map, Entry<K, V> entry, TypeReference<Map<K, V>> mapType, TypeReference<Entry<K, V>> entryType) {
    JaxMap.require(map, mapType);
    JaxMapEntry.require(entry, entryType);
    return map.put(entry.getKey(), entry.getValue());
  }

  public static <K, V> V remove(Map<K, V> map, K key) {
    JaxMap.require(map);
    return map.remove(key);
  }

  public static <K, V> V remove(Map<K, V> map, K key, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.remove(key);
  }

  public static <K, V> void clear(Map<K, V> map) {
    JaxMap.require(map);
    map.clear();
  }

  public static <K, V> void clear(Map<K, V> map, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    map.clear();
  }

  public static <K, V> V computeIfPresent(Map<K, V> map, K key, BiFunction<? super K, ? super V, ? extends V> function) {
    JaxMap.require(map);
    return map.computeIfPresent(key, function);
  }

  public static <K, V> V computeIfPresent(Map<K, V> map, K key, BiFunction<? super K, ? super V, ? extends V> function, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.computeIfPresent(key, function);
  }

  public static <K, V> V computeIfAbsent(Map<K, V> map, K key, Function<? super K, ? extends V> function) {
    JaxMap.require(map);
    return map.computeIfAbsent(key, function);
  }

  public static <K, V> V computeIfAbsent(Map<K, V> map, K key, Function<? super K, ? extends V> function, TypeReference<Map<K, V>> mapType) {
    JaxMap.require(map, mapType);
    return map.computeIfAbsent(key, function);
  }
}
