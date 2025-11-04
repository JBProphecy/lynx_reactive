package com.example.lynx.app.constants;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public class JaxTypeConstants
{
  private JaxTypeConstants() { throw JaxForbiddenConstructorException.create(JaxTypeConstants.class); }
  
  private static final String URN = "urn";
    private static final String URN_HOTBOX = URN + ":hotbox";
      public static final String URN_HOTBOX_ERROR = URN_HOTBOX + ":error";
      public static final String URN_HOTBOX_REQUEST = URN_HOTBOX + ":request";
      public static final String URN_HOTBOX_RESPONSE = URN_HOTBOX + ":response";
}
