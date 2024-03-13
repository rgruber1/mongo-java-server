package de.bwaldvogel.mongo;

import de.bwaldvogel.mongo.backend.Utils;

import java.util.List;

public interface MongoVersion {

    List<Integer> getVersionArray();

    default String toVersionString() {
        return Utils.join(getVersionArray(), ".");
    }

    int getWireVersion();

}
