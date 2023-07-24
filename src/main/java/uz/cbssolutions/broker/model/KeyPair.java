package uz.cbssolutions.broker.model;

/**
 * Simple key-value pair object.
 *
 * @param key      The key.
 * @param value    The value.
 * @param <TKey>   Type of the key.
 * @param <TValue> Type of the value
 */
public record KeyPair<TKey, TValue>(TKey key, TValue value) {
}
