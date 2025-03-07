// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSetLogicalTableMapDataTransformRenameColumnOperation {
    /**
     * @return Column to be renamed.
     * 
     */
    private String columnName;
    /**
     * @return New name for the column.
     * 
     */
    private String newColumnName;

    private DataSetLogicalTableMapDataTransformRenameColumnOperation() {}
    /**
     * @return Column to be renamed.
     * 
     */
    public String columnName() {
        return this.columnName;
    }
    /**
     * @return New name for the column.
     * 
     */
    public String newColumnName() {
        return this.newColumnName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetLogicalTableMapDataTransformRenameColumnOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String columnName;
        private String newColumnName;
        public Builder() {}
        public Builder(DataSetLogicalTableMapDataTransformRenameColumnOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.newColumnName = defaults.newColumnName;
        }

        @CustomType.Setter
        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        @CustomType.Setter
        public Builder newColumnName(String newColumnName) {
            this.newColumnName = Objects.requireNonNull(newColumnName);
            return this;
        }
        public DataSetLogicalTableMapDataTransformRenameColumnOperation build() {
            final var o = new DataSetLogicalTableMapDataTransformRenameColumnOperation();
            o.columnName = columnName;
            o.newColumnName = newColumnName;
            return o;
        }
    }
}
