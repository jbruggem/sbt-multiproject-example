import AssemblyKeys._ 

assemblySettings

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case x => old(x)
  }
}
