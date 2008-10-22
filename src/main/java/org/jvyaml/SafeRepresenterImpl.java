/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package org.jvyaml;

/**
 * @see PyYAML for more information
 */
public class SafeRepresenterImpl extends RepresenterImpl {
    public SafeRepresenterImpl(final Serializer serializer, final YAMLConfig opts) {
        super(serializer, opts);
    }

    protected boolean ignoreAliases(final Object data) {
        return data == null || data instanceof String || data instanceof Boolean
                || data instanceof Integer || data instanceof Float || data instanceof Double;
    }
}
