package com.example.lynx.core.types.t3;

import java.util.Map.Entry;

import com.example.lynx.core.exceptions.JaxForbiddenConstructorException;
import com.example.lynx.core.types.t0.JaxEntity;
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
