package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.PostbusAdresType;

public class PostbusAdresTypeBuilder extends NederlandsAdresTypeBuilder<PostbusAdresTypeBuilder, PostbusAdresType> {

    private PostbusAdresType postbusAdresType = null;

    @Override
    protected PostbusAdresType getObject() {
        if (postbusAdresType == null) {
            postbusAdresType = new PostbusAdresType();
        }
        return postbusAdresType;
    }

    public PostbusAdresTypeBuilder postbusnummer(final int postbusnummer) {
        getObject().setPostbusnummer(postbusnummer);
        return this;
    }

    public PostbusAdresType build() {
        return getObject();
    }
}
