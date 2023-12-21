package co.hei.bigSum.file;

import co.hei.bigSum.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
