package com.example.lynx.core.c1.utilities.u0.types.t1;

import java.util.Map.Entry;

import com.example.lynx.core.c0.exception.e1.JaxForbiddenConstructorException;
import com.example.lynx.core.c1.utilities.u0.types.t0.JaxEntity;
import com.fasterxml.jackson.core.type.TypeReference;

public final class JaxMapEntry
{
  private JaxMapEntry() { throw JaxForbiddenConstructorException.create(JaxMapEntry.class); }

  public static <K, V> Entry<K, V> require(Entry<K, V> entry) {
    return JaxEntity.require(entry, Entry.class);
  }

  public static <K, V> Entry<K, V> require(Entry<K, V> entry, TypeReference<Entry<K, V>> entryType) {
    return JaxEntity.require(entry, entryType);
  }
}
