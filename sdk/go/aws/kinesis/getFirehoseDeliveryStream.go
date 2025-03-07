// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kinesis

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
//
// For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kinesis"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kinesis.LookupFirehoseDeliveryStream(ctx, &kinesis.LookupFirehoseDeliveryStreamArgs{
//				Name: "stream-name",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFirehoseDeliveryStream(ctx *pulumi.Context, args *LookupFirehoseDeliveryStreamArgs, opts ...pulumi.InvokeOption) (*LookupFirehoseDeliveryStreamResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFirehoseDeliveryStreamResult
	err := ctx.Invoke("aws:kinesis/getFirehoseDeliveryStream:getFirehoseDeliveryStream", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirehoseDeliveryStream.
type LookupFirehoseDeliveryStreamArgs struct {
	// Name of the Kinesis Stream.
	Name string `pulumi:"name"`
}

// A collection of values returned by getFirehoseDeliveryStream.
type LookupFirehoseDeliveryStreamResult struct {
	// ARN of the Kinesis Stream (same as id).
	Arn string `pulumi:"arn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupFirehoseDeliveryStreamOutput(ctx *pulumi.Context, args LookupFirehoseDeliveryStreamOutputArgs, opts ...pulumi.InvokeOption) LookupFirehoseDeliveryStreamResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFirehoseDeliveryStreamResult, error) {
			args := v.(LookupFirehoseDeliveryStreamArgs)
			r, err := LookupFirehoseDeliveryStream(ctx, &args, opts...)
			var s LookupFirehoseDeliveryStreamResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFirehoseDeliveryStreamResultOutput)
}

// A collection of arguments for invoking getFirehoseDeliveryStream.
type LookupFirehoseDeliveryStreamOutputArgs struct {
	// Name of the Kinesis Stream.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupFirehoseDeliveryStreamOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirehoseDeliveryStreamArgs)(nil)).Elem()
}

// A collection of values returned by getFirehoseDeliveryStream.
type LookupFirehoseDeliveryStreamResultOutput struct{ *pulumi.OutputState }

func (LookupFirehoseDeliveryStreamResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirehoseDeliveryStreamResult)(nil)).Elem()
}

func (o LookupFirehoseDeliveryStreamResultOutput) ToLookupFirehoseDeliveryStreamResultOutput() LookupFirehoseDeliveryStreamResultOutput {
	return o
}

func (o LookupFirehoseDeliveryStreamResultOutput) ToLookupFirehoseDeliveryStreamResultOutputWithContext(ctx context.Context) LookupFirehoseDeliveryStreamResultOutput {
	return o
}

func (o LookupFirehoseDeliveryStreamResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupFirehoseDeliveryStreamResult] {
	return pulumix.Output[LookupFirehoseDeliveryStreamResult]{
		OutputState: o.OutputState,
	}
}

// ARN of the Kinesis Stream (same as id).
func (o LookupFirehoseDeliveryStreamResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirehoseDeliveryStreamResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFirehoseDeliveryStreamResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirehoseDeliveryStreamResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFirehoseDeliveryStreamResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirehoseDeliveryStreamResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFirehoseDeliveryStreamResultOutput{})
}
