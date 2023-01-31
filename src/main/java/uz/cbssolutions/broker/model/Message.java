package uz.cbssolutions.broker.model;

import java.util.Map;

/**
 * Model of broker's common message.
 *
 * @param model    Body of message.
 * @param headers  Header of message.
 * @param <TModel> Type of message's body.
 */
public record Message<TModel>(TModel model, Map<String, String> headers) {
}
