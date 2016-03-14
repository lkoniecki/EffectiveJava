package workshop.exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.Maps;

public class Exercise1 {
	public Map<String, Long> groupBy(List<String> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("List should not be null");
		}

		if (elements.isEmpty()) {
			return Maps.newHashMap();
		}

		return elements.stream().collect(Collectors.groupingBy(k->k, Collectors.counting()));
	}
}
