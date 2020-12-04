/* open */module Provider {
  exports myprovider;
  // exports <package> to <module>, <module>
  //  exports internal;
  opens myprovider;
  // provides <service--a typename> with <implementing class>
  // uses <service>
}
/*
A) do quzzes
B) don't
 */