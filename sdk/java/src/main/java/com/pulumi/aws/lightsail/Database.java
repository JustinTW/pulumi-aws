// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.DatabaseArgs;
import com.pulumi.aws.lightsail.inputs.DatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Lightsail Database. Amazon Lightsail is a service to provide easy virtual private servers
 * with custom software already setup. See [What is Amazon Lightsail?](https://lightsail.aws.amazon.com/ls/docs/getting-started/article/what-is-amazon-lightsail)
 * for more information.
 * 
 * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones&#34;](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services/) for more details
 * 
 * ## Example Usage
 * ### Basic mysql blueprint
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Database;
 * import com.pulumi.aws.lightsail.DatabaseArgs;
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
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .blueprintId(&#34;mysql_8_0&#34;)
 *             .bundleId(&#34;micro_1_0&#34;)
 *             .masterDatabaseName(&#34;testdatabasename&#34;)
 *             .masterPassword(&#34;testdatabasepassword&#34;)
 *             .masterUsername(&#34;test&#34;)
 *             .relationalDatabaseName(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Basic postrgres blueprint
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Database;
 * import com.pulumi.aws.lightsail.DatabaseArgs;
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
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .blueprintId(&#34;postgres_12&#34;)
 *             .bundleId(&#34;micro_1_0&#34;)
 *             .masterDatabaseName(&#34;testdatabasename&#34;)
 *             .masterPassword(&#34;testdatabasepassword&#34;)
 *             .masterUsername(&#34;test&#34;)
 *             .relationalDatabaseName(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Custom backup and maintenance windows
 * 
 * Below is an example that sets a custom backup and maintenance window. Times are specified in UTC. This example will allow daily backups to take place between 16:00 and 16:30 each day. This example also requires any maintiance tasks (anything that would cause an outage, including changing some attributes) to take place on Tuesdays between 17:00 and 17:30. An action taken against this database that would cause an outage will wait until this time window to make the requested changes.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Database;
 * import com.pulumi.aws.lightsail.DatabaseArgs;
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
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .blueprintId(&#34;postgres_12&#34;)
 *             .bundleId(&#34;micro_1_0&#34;)
 *             .masterDatabaseName(&#34;testdatabasename&#34;)
 *             .masterPassword(&#34;testdatabasepassword&#34;)
 *             .masterUsername(&#34;test&#34;)
 *             .preferredBackupWindow(&#34;16:00-16:30&#34;)
 *             .preferredMaintenanceWindow(&#34;Tue:17:00-Tue:17:30&#34;)
 *             .relationalDatabaseName(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Final Snapshots
 * 
 * To enable creating a final snapshot of your database on deletion, use the `final_snapshot_name` argument to provide a name to be used for the snapshot.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Database;
 * import com.pulumi.aws.lightsail.DatabaseArgs;
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
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .blueprintId(&#34;postgres_12&#34;)
 *             .bundleId(&#34;micro_1_0&#34;)
 *             .finalSnapshotName(&#34;MyFinalSnapshot&#34;)
 *             .masterDatabaseName(&#34;testdatabasename&#34;)
 *             .masterPassword(&#34;testdatabasepassword&#34;)
 *             .masterUsername(&#34;test&#34;)
 *             .preferredBackupWindow(&#34;16:00-16:30&#34;)
 *             .preferredMaintenanceWindow(&#34;Tue:17:00-Tue:17:30&#34;)
 *             .relationalDatabaseName(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Apply Immediately
 * 
 * To enable applying changes immediately instead of waiting for a maintiance window, use the `apply_immediately` argument.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Database;
 * import com.pulumi.aws.lightsail.DatabaseArgs;
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
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .applyImmediately(true)
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .blueprintId(&#34;postgres_12&#34;)
 *             .bundleId(&#34;micro_1_0&#34;)
 *             .masterDatabaseName(&#34;testdatabasename&#34;)
 *             .masterPassword(&#34;testdatabasepassword&#34;)
 *             .masterUsername(&#34;test&#34;)
 *             .relationalDatabaseName(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Blueprint Ids
 * 
 * A list of all available Lightsail Blueprints for Relational Databases the [aws lightsail get-relational-database-blueprints](https://docs.aws.amazon.com/cli/latest/reference/lightsail/get-relational-database-blueprints.html) aws cli command.
 * 
 * ### Examples
 * 
 * - `mysql_8_0`
 * - `postgres_12`
 * 
 * ### Prefix
 * 
 * A Blueprint ID starts with a prefix of the engine type.
 * 
 * ### Suffix
 * 
 * A Blueprint ID has a sufix of the engine version.
 * 
 * ## Bundles
 * 
 * A list of all available Lightsail Bundles for Relational Databases the [aws lightsail get-relational-database-bundles](https://docs.aws.amazon.com/cli/latest/reference/lightsail/get-relational-database-bundles.html) aws cli command.
 * 
 * ### Examples
 * 
 * - `small_1_0`
 * - `small_ha_1_0`
 * - `large_1_0`
 * - `large_ha_1_0`
 * 
 * ### Prefix
 * 
 * A Bundle ID starts with one of the below size prefixes:
 * 
 * - `micro_`
 * - `small_`
 * - `medium_`
 * - `large_`
 * 
 * ### Infixes (Optional for HA Database)
 * 
 * A Bundle Id can have the following infix added in order to use the HA option of the selected bundle.
 * 
 * - `ha_`
 * 
 * ### Suffix
 * 
 * A Bundle ID ends with one of the following suffix: `1_0`
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lightsail Databases using their name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/database:Database foo &#39;bar&#39;
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * When true , applies changes immediately. When false , applies changes during the preferred maintenance window. Some changes may cause an outage.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> applyImmediately;

    /**
     * @return When true , applies changes immediately. When false , applies changes during the preferred maintenance window. Some changes may cause an outage.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * The ARN of the Lightsail instance (matches `id`).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Lightsail instance (matches `id`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * When true, enables automated backup retention for your database. When false, disables automated backup retention for your database. Disabling backup retention deletes all automated database backups. Before disabling this, you may want to create a snapshot of your database.
     * 
     */
    @Export(name="backupRetentionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> backupRetentionEnabled;

    /**
     * @return When true, enables automated backup retention for your database. When false, disables automated backup retention for your database. Disabling backup retention deletes all automated database backups. Before disabling this, you may want to create a snapshot of your database.
     * 
     */
    public Output<Optional<Boolean>> backupRetentionEnabled() {
        return Codegen.optional(this.backupRetentionEnabled);
    }
    /**
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database. You can get a list of database blueprints IDs by using the AWS CLI command: `aws lightsail get-relational-database-blueprints`
     * 
     */
    @Export(name="blueprintId", refs={String.class}, tree="[0]")
    private Output<String> blueprintId;

    /**
     * @return The blueprint ID for your new database. A blueprint describes the major engine version of a database. You can get a list of database blueprints IDs by using the AWS CLI command: `aws lightsail get-relational-database-blueprints`
     * 
     */
    public Output<String> blueprintId() {
        return this.blueprintId;
    }
    /**
     * The bundle ID for your new database. A bundle describes the performance specifications for your database (see list below). You can get a list of database bundle IDs by using the AWS CLI command: `aws lightsail get-relational-database-bundles`.
     * 
     */
    @Export(name="bundleId", refs={String.class}, tree="[0]")
    private Output<String> bundleId;

    /**
     * @return The bundle ID for your new database. A bundle describes the performance specifications for your database (see list below). You can get a list of database bundle IDs by using the AWS CLI command: `aws lightsail get-relational-database-bundles`.
     * 
     */
    public Output<String> bundleId() {
        return this.bundleId;
    }
    /**
     * The certificate associated with the database.
     * 
     */
    @Export(name="caCertificateIdentifier", refs={String.class}, tree="[0]")
    private Output<String> caCertificateIdentifier;

    /**
     * @return The certificate associated with the database.
     * 
     */
    public Output<String> caCertificateIdentifier() {
        return this.caCertificateIdentifier;
    }
    /**
     * The number of vCPUs for the database.
     * 
     */
    @Export(name="cpuCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> cpuCount;

    /**
     * @return The number of vCPUs for the database.
     * 
     */
    public Output<Integer> cpuCount() {
        return this.cpuCount;
    }
    /**
     * The timestamp when the instance was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The timestamp when the instance was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The size of the disk for the database.
     * 
     */
    @Export(name="diskSize", refs={Double.class}, tree="[0]")
    private Output<Double> diskSize;

    /**
     * @return The size of the disk for the database.
     * 
     */
    public Output<Double> diskSize() {
        return this.diskSize;
    }
    /**
     * The database software (for example, MySQL).
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return The database software (for example, MySQL).
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The database engine version (for example, 5.7.23).
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return The database engine version (for example, 5.7.23).
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.
     * 
     */
    @Export(name="finalSnapshotName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> finalSnapshotName;

    /**
     * @return The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.
     * 
     */
    public Output<Optional<String>> finalSnapshotName() {
        return Codegen.optional(this.finalSnapshotName);
    }
    /**
     * The name of the master database created when the Lightsail database resource is created.
     * 
     */
    @Export(name="masterDatabaseName", refs={String.class}, tree="[0]")
    private Output<String> masterDatabaseName;

    /**
     * @return The name of the master database created when the Lightsail database resource is created.
     * 
     */
    public Output<String> masterDatabaseName() {
        return this.masterDatabaseName;
    }
    /**
     * The master endpoint fqdn for the database.
     * 
     */
    @Export(name="masterEndpointAddress", refs={String.class}, tree="[0]")
    private Output<String> masterEndpointAddress;

    /**
     * @return The master endpoint fqdn for the database.
     * 
     */
    public Output<String> masterEndpointAddress() {
        return this.masterEndpointAddress;
    }
    /**
     * The master endpoint network port for the database.
     * 
     */
    @Export(name="masterEndpointPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> masterEndpointPort;

    /**
     * @return The master endpoint network port for the database.
     * 
     */
    public Output<Integer> masterEndpointPort() {
        return this.masterEndpointPort;
    }
    /**
     * The password for the master user of your new database. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;.
     * 
     */
    @Export(name="masterPassword", refs={String.class}, tree="[0]")
    private Output<String> masterPassword;

    /**
     * @return The password for the master user of your new database. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;.
     * 
     */
    public Output<String> masterPassword() {
        return this.masterPassword;
    }
    /**
     * The master user name for your new database.
     * 
     */
    @Export(name="masterUsername", refs={String.class}, tree="[0]")
    private Output<String> masterUsername;

    /**
     * @return The master user name for your new database.
     * 
     */
    public Output<String> masterUsername() {
        return this.masterUsername;
    }
    /**
     * The daily time range during which automated backups are created for your new database if automated backups are enabled. Must be in the hh24:mi-hh24:mi format. Example: `16:00-16:30`. Specified in Coordinated Universal Time (UTC).
     * 
     */
    @Export(name="preferredBackupWindow", refs={String.class}, tree="[0]")
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created for your new database if automated backups are enabled. Must be in the hh24:mi-hh24:mi format. Example: `16:00-16:30`. Specified in Coordinated Universal Time (UTC).
     * 
     */
    public Output<String> preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The weekly time range during which system maintenance can occur on your new database. Must be in the ddd:hh24:mi-ddd:hh24:mi format. Specified in Coordinated Universal Time (UTC). Example: `Tue:17:00-Tue:17:30`
     * 
     */
    @Export(name="preferredMaintenanceWindow", refs={String.class}, tree="[0]")
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur on your new database. Must be in the ddd:hh24:mi-ddd:hh24:mi format. Specified in Coordinated Universal Time (UTC). Example: `Tue:17:00-Tue:17:30`
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
     * 
     */
    @Export(name="publiclyAccessible", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
     * 
     */
    public Output<Optional<Boolean>> publiclyAccessible() {
        return Codegen.optional(this.publiclyAccessible);
    }
    /**
     * The amount of RAM in GB for the database.
     * 
     */
    @Export(name="ramSize", refs={Double.class}, tree="[0]")
    private Output<Double> ramSize;

    /**
     * @return The amount of RAM in GB for the database.
     * 
     */
    public Output<Double> ramSize() {
        return this.ramSize;
    }
    /**
     * The name to use for your new Lightsail database resource. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @Export(name="relationalDatabaseName", refs={String.class}, tree="[0]")
    private Output<String> relationalDatabaseName;

    /**
     * @return The name to use for your new Lightsail database resource. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    public Output<String> relationalDatabaseName() {
        return this.relationalDatabaseName;
    }
    /**
     * Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
     * 
     */
    @Export(name="secondaryAvailabilityZone", refs={String.class}, tree="[0]")
    private Output<String> secondaryAvailabilityZone;

    /**
     * @return Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
     * 
     */
    public Output<String> secondaryAvailabilityZone() {
        return this.secondaryAvailabilityZone;
    }
    /**
     * Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false.
     * 
     */
    @Export(name="skipFinalSnapshot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false.
     * 
     */
    public Output<Optional<Boolean>> skipFinalSnapshot() {
        return Codegen.optional(this.skipFinalSnapshot);
    }
    /**
     * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * 
     */
    @Export(name="supportCode", refs={String.class}, tree="[0]")
    private Output<String> supportCode;

    /**
     * @return The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * 
     */
    public Output<String> supportCode() {
        return this.supportCode;
    }
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/database:Database", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "masterPassword",
                "tagsAll"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
