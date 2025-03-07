// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserHomeDirectoryMapping {
    /**
     * @return Represents an entry and a target.
     * 
     */
    private String entry;
    /**
     * @return Represents the map target.
     * 
     * The `Restricted` option is achieved using the following mapping:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    private String target;

    private UserHomeDirectoryMapping() {}
    /**
     * @return Represents an entry and a target.
     * 
     */
    public String entry() {
        return this.entry;
    }
    /**
     * @return Represents the map target.
     * 
     * The `Restricted` option is achieved using the following mapping:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserHomeDirectoryMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entry;
        private String target;
        public Builder() {}
        public Builder(UserHomeDirectoryMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder entry(String entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public UserHomeDirectoryMapping build() {
            final var o = new UserHomeDirectoryMapping();
            o.entry = entry;
            o.target = target;
            return o;
        }
    }
}
