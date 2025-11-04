package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.util.List;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxList
{
  private JaxList() { throw JaxForbiddenConstructorException.create(JaxList.class); }

  public static <I> List<I> require(List<I> list) {
    return JaxEntity.require(list, List.class);
  }

  public static <I> List<I> require(List<I> list, TypeReference<List<I>> listType) {
    return JaxEntity.require(list, listType);
  }

  public static <I> boolean checkIsEmpty(List<I> list) {
    JaxList.require(list);
    return list.isEmpty();
  }

  public static <I> boolean checkIsEmpty(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.isEmpty();
  }

  public static <I> boolean checkIsNotEmpty(List<I> list) {
    JaxList.require(list);
    return !list.isEmpty();
  }

  public static <I> boolean checkIsNotEmpty(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return !list.isEmpty();
  }

  public static <I> int getSize(List<I> list) {
    JaxList.require(list);
    return list.size();
  }

  public static <I> int getSize(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.size();
  }

  public static <I> I getValue(List<I> list, int index) {
    JaxList.require(list);
    return list.get(index);
  }

  public static <I> I getValue(List<I> list, int index, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.get(index);
  }

  public static <I> I getFirstValue(List<I> list) {
    JaxList.require(list);
    return list.getFirst();
  }

  public static <I> I getFirstValue(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.getFirst();
  }

  public static <I> I getLastValue(List<I> list) {
    JaxList.require(list);
    return list.getLast();
  }

  public static <I> I getLastValue(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.getLast();
  }

  public static <I> boolean add(List<I> list, I item) {
    JaxList.require(list);
    return list.add(item);
  }

  public static <I> boolean add(List<I> list, I item, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    return list.add(item);
  }

  public static <I> void clear(List<I> list) {
    JaxList.require(list);
    list.clear();
  }

  public static <I> void clear(List<I> list, TypeReference<List<I>> listType) {
    JaxList.require(list, listType);
    list.clear();
  }
}
