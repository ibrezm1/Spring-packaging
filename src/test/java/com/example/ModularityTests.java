package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {

	ApplicationModules modules = ApplicationModules.of(DemoApplication.class);

	@Test
	void verifyModularity() {
		modules.verify();
	}

	@Test
	void writeDocumentation() {
		// This optionally generates documentation diagrams in build/spring-modulith
		// but requires the spring-modulith-docs dependency or similar.
		// For now, just verifying is enough for Stage 3.
	}
}
