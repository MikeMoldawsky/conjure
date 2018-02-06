package com.palantir.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

@JsonDeserialize(builder = ReservedKeyExample.Builder.class)
@Generated("com.palantir.conjure.gen.java.types.BeanGenerator")
public final class ReservedKeyExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String package_;

    private final String interface_;

    private ReservedKeyExample(String package_, String interface_) {
        validateFields(package_, interface_);
        this.package_ = package_;
        this.interface_ = interface_;
    }

    @JsonProperty("package")
    public String getPackage() {
        return this.package_;
    }

    @JsonProperty("interface")
    public String getInterface() {
        return this.interface_;
    }

    @Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof ReservedKeyExample && equalTo((ReservedKeyExample) other));
    }

    private boolean equalTo(ReservedKeyExample other) {
        return this.package_.equals(other.package_) && this.interface_.equals(other.interface_);
    }

    @Override
    public int hashCode() {
        return Objects.hash(package_, interface_);
    }

    @Override
    public String toString() {
        return new StringBuilder("ReservedKeyExample")
                .append("{")
                .append("package")
                .append(": ")
                .append(package_)
                .append(", ")
                .append("interface")
                .append(": ")
                .append(interface_)
                .append("}")
                .toString();
    }

    public static ReservedKeyExample of(String package_, String interface_) {
        return builder().package_(package_).interface_(interface_).build();
    }

    private static void validateFields(String package_, String interface_) {
        List<String> missingFields = null;
        missingFields = addFieldIfMissing(missingFields, package_, "package_");
        missingFields = addFieldIfMissing(missingFields, interface_, "interface_");
        if (missingFields != null) {
            throw new IllegalArgumentException(
                    "Some required fields have not been set: " + missingFields);
        }
    }

    private static List<String> addFieldIfMissing(
            List<String> prev, Object fieldValue, String fieldName) {
        List<String> missingFields = prev;
        if (fieldValue == null) {
            if (missingFields == null) {
                missingFields = new ArrayList<>(2);
            }
            missingFields.add(fieldName);
        }
        return missingFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Generated("com.palantir.conjure.gen.java.types.BeanBuilderGenerator")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private String package_;

        private String interface_;

        private Builder() {}

        public Builder from(ReservedKeyExample other) {
            package_(other.getPackage());
            interface_(other.getInterface());
            return this;
        }

        @JsonSetter("package")
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_, "package_ cannot be null");
            return this;
        }

        @JsonSetter("interface")
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_, "interface_ cannot be null");
            return this;
        }

        public ReservedKeyExample build() {
            return new ReservedKeyExample(package_, interface_);
        }
    }
}
