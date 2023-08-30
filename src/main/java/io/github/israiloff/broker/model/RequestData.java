package io.github.israiloff.broker.model;

import java.util.Map;

/**
 * Request data holder object.
 *
 * @param topic    Name of the topic.
 * @param jsonBody Body of request in the JSON format.
 * @param headers  Additional headers.
 */
public record RequestData(String topic, String jsonBody, Map<String, Object> headers) {
}
