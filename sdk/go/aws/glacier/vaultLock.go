// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package glacier

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a Glacier Vault Lock. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html) for a full explanation of the Glacier Vault Lock functionality.
//
// > **NOTE:** This resource allows you to test Glacier Vault Lock policies by setting the `completeLock` argument to `false`. When testing policies in this manner, the Glacier Vault Lock automatically expires after 24 hours and this provider will show this resource as needing recreation after that time. To permanently apply the policy, set the `completeLock` argument to `true`. When changing `completeLock` to `true`, it is expected the resource will show as recreating.
//
// !> **WARNING:** Once a Glacier Vault Lock is completed, it is immutable. The deletion of the Glacier Vault Lock is not be possible and attempting to remove it from this provider will return an error. Set the `ignoreDeletionError` argument to `true` and apply this configuration before attempting to delete this resource via this provider or remove this resource from this provider's management.
//
// ## Example Usage
// ### Testing Glacier Vault Lock Policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glacier"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleVault, err := glacier.NewVault(ctx, "exampleVault", nil)
//			if err != nil {
//				return err
//			}
//			examplePolicyDocument := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Actions: pulumi.StringArray{
//							pulumi.String("glacier:DeleteArchive"),
//						},
//						Effect: pulumi.String("Deny"),
//						Resources: pulumi.StringArray{
//							exampleVault.Arn,
//						},
//						Conditions: iam.GetPolicyDocumentStatementConditionArray{
//							&iam.GetPolicyDocumentStatementConditionArgs{
//								Test:     pulumi.String("NumericLessThanEquals"),
//								Variable: pulumi.String("glacier:ArchiveAgeinDays"),
//								Values: pulumi.StringArray{
//									pulumi.String("365"),
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			_, err = glacier.NewVaultLock(ctx, "exampleVaultLock", &glacier.VaultLockArgs{
//				CompleteLock: pulumi.Bool(false),
//				Policy: examplePolicyDocument.ApplyT(func(examplePolicyDocument iam.GetPolicyDocumentResult) (*string, error) {
//					return &examplePolicyDocument.Json, nil
//				}).(pulumi.StringPtrOutput),
//				VaultName: exampleVault.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Permanently Applying Glacier Vault Lock Policy
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glacier"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glacier.NewVaultLock(ctx, "example", &glacier.VaultLockArgs{
//				CompleteLock: pulumi.Bool(true),
//				Policy:       pulumi.Any(data.Aws_iam_policy_document.Example.Json),
//				VaultName:    pulumi.Any(aws_glacier_vault.Example.Name),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import Glacier Vault Locks using the Glacier Vault name. For example:
//
// ```sh
//
//	$ pulumi import aws:glacier/vaultLock:VaultLock example example-vault
//
// ```
type VaultLock struct {
	pulumi.CustomResourceState

	// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
	CompleteLock pulumi.BoolOutput `pulumi:"completeLock"`
	// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
	IgnoreDeletionError pulumi.BoolPtrOutput `pulumi:"ignoreDeletionError"`
	// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// The name of the Glacier Vault.
	VaultName pulumi.StringOutput `pulumi:"vaultName"`
}

// NewVaultLock registers a new resource with the given unique name, arguments, and options.
func NewVaultLock(ctx *pulumi.Context,
	name string, args *VaultLockArgs, opts ...pulumi.ResourceOption) (*VaultLock, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CompleteLock == nil {
		return nil, errors.New("invalid value for required argument 'CompleteLock'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.VaultName == nil {
		return nil, errors.New("invalid value for required argument 'VaultName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VaultLock
	err := ctx.RegisterResource("aws:glacier/vaultLock:VaultLock", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVaultLock gets an existing VaultLock resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVaultLock(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VaultLockState, opts ...pulumi.ResourceOption) (*VaultLock, error) {
	var resource VaultLock
	err := ctx.ReadResource("aws:glacier/vaultLock:VaultLock", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VaultLock resources.
type vaultLockState struct {
	// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
	CompleteLock *bool `pulumi:"completeLock"`
	// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
	IgnoreDeletionError *bool `pulumi:"ignoreDeletionError"`
	// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
	Policy *string `pulumi:"policy"`
	// The name of the Glacier Vault.
	VaultName *string `pulumi:"vaultName"`
}

type VaultLockState struct {
	// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
	CompleteLock pulumi.BoolPtrInput
	// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
	IgnoreDeletionError pulumi.BoolPtrInput
	// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
	Policy pulumi.StringPtrInput
	// The name of the Glacier Vault.
	VaultName pulumi.StringPtrInput
}

func (VaultLockState) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultLockState)(nil)).Elem()
}

type vaultLockArgs struct {
	// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
	CompleteLock bool `pulumi:"completeLock"`
	// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
	IgnoreDeletionError *bool `pulumi:"ignoreDeletionError"`
	// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
	Policy string `pulumi:"policy"`
	// The name of the Glacier Vault.
	VaultName string `pulumi:"vaultName"`
}

// The set of arguments for constructing a VaultLock resource.
type VaultLockArgs struct {
	// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
	CompleteLock pulumi.BoolInput
	// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
	IgnoreDeletionError pulumi.BoolPtrInput
	// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
	Policy pulumi.StringInput
	// The name of the Glacier Vault.
	VaultName pulumi.StringInput
}

func (VaultLockArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultLockArgs)(nil)).Elem()
}

type VaultLockInput interface {
	pulumi.Input

	ToVaultLockOutput() VaultLockOutput
	ToVaultLockOutputWithContext(ctx context.Context) VaultLockOutput
}

func (*VaultLock) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultLock)(nil)).Elem()
}

func (i *VaultLock) ToVaultLockOutput() VaultLockOutput {
	return i.ToVaultLockOutputWithContext(context.Background())
}

func (i *VaultLock) ToVaultLockOutputWithContext(ctx context.Context) VaultLockOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultLockOutput)
}

func (i *VaultLock) ToOutput(ctx context.Context) pulumix.Output[*VaultLock] {
	return pulumix.Output[*VaultLock]{
		OutputState: i.ToVaultLockOutputWithContext(ctx).OutputState,
	}
}

// VaultLockArrayInput is an input type that accepts VaultLockArray and VaultLockArrayOutput values.
// You can construct a concrete instance of `VaultLockArrayInput` via:
//
//	VaultLockArray{ VaultLockArgs{...} }
type VaultLockArrayInput interface {
	pulumi.Input

	ToVaultLockArrayOutput() VaultLockArrayOutput
	ToVaultLockArrayOutputWithContext(context.Context) VaultLockArrayOutput
}

type VaultLockArray []VaultLockInput

func (VaultLockArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultLock)(nil)).Elem()
}

func (i VaultLockArray) ToVaultLockArrayOutput() VaultLockArrayOutput {
	return i.ToVaultLockArrayOutputWithContext(context.Background())
}

func (i VaultLockArray) ToVaultLockArrayOutputWithContext(ctx context.Context) VaultLockArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultLockArrayOutput)
}

func (i VaultLockArray) ToOutput(ctx context.Context) pulumix.Output[[]*VaultLock] {
	return pulumix.Output[[]*VaultLock]{
		OutputState: i.ToVaultLockArrayOutputWithContext(ctx).OutputState,
	}
}

// VaultLockMapInput is an input type that accepts VaultLockMap and VaultLockMapOutput values.
// You can construct a concrete instance of `VaultLockMapInput` via:
//
//	VaultLockMap{ "key": VaultLockArgs{...} }
type VaultLockMapInput interface {
	pulumi.Input

	ToVaultLockMapOutput() VaultLockMapOutput
	ToVaultLockMapOutputWithContext(context.Context) VaultLockMapOutput
}

type VaultLockMap map[string]VaultLockInput

func (VaultLockMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultLock)(nil)).Elem()
}

func (i VaultLockMap) ToVaultLockMapOutput() VaultLockMapOutput {
	return i.ToVaultLockMapOutputWithContext(context.Background())
}

func (i VaultLockMap) ToVaultLockMapOutputWithContext(ctx context.Context) VaultLockMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultLockMapOutput)
}

func (i VaultLockMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*VaultLock] {
	return pulumix.Output[map[string]*VaultLock]{
		OutputState: i.ToVaultLockMapOutputWithContext(ctx).OutputState,
	}
}

type VaultLockOutput struct{ *pulumi.OutputState }

func (VaultLockOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultLock)(nil)).Elem()
}

func (o VaultLockOutput) ToVaultLockOutput() VaultLockOutput {
	return o
}

func (o VaultLockOutput) ToVaultLockOutputWithContext(ctx context.Context) VaultLockOutput {
	return o
}

func (o VaultLockOutput) ToOutput(ctx context.Context) pulumix.Output[*VaultLock] {
	return pulumix.Output[*VaultLock]{
		OutputState: o.OutputState,
	}
}

// Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
func (o VaultLockOutput) CompleteLock() pulumi.BoolOutput {
	return o.ApplyT(func(v *VaultLock) pulumi.BoolOutput { return v.CompleteLock }).(pulumi.BoolOutput)
}

// Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
func (o VaultLockOutput) IgnoreDeletionError() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultLock) pulumi.BoolPtrOutput { return v.IgnoreDeletionError }).(pulumi.BoolPtrOutput)
}

// JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
func (o VaultLockOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultLock) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// The name of the Glacier Vault.
func (o VaultLockOutput) VaultName() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultLock) pulumi.StringOutput { return v.VaultName }).(pulumi.StringOutput)
}

type VaultLockArrayOutput struct{ *pulumi.OutputState }

func (VaultLockArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultLock)(nil)).Elem()
}

func (o VaultLockArrayOutput) ToVaultLockArrayOutput() VaultLockArrayOutput {
	return o
}

func (o VaultLockArrayOutput) ToVaultLockArrayOutputWithContext(ctx context.Context) VaultLockArrayOutput {
	return o
}

func (o VaultLockArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*VaultLock] {
	return pulumix.Output[[]*VaultLock]{
		OutputState: o.OutputState,
	}
}

func (o VaultLockArrayOutput) Index(i pulumi.IntInput) VaultLockOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VaultLock {
		return vs[0].([]*VaultLock)[vs[1].(int)]
	}).(VaultLockOutput)
}

type VaultLockMapOutput struct{ *pulumi.OutputState }

func (VaultLockMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultLock)(nil)).Elem()
}

func (o VaultLockMapOutput) ToVaultLockMapOutput() VaultLockMapOutput {
	return o
}

func (o VaultLockMapOutput) ToVaultLockMapOutputWithContext(ctx context.Context) VaultLockMapOutput {
	return o
}

func (o VaultLockMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*VaultLock] {
	return pulumix.Output[map[string]*VaultLock]{
		OutputState: o.OutputState,
	}
}

func (o VaultLockMapOutput) MapIndex(k pulumi.StringInput) VaultLockOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VaultLock {
		return vs[0].(map[string]*VaultLock)[vs[1].(string)]
	}).(VaultLockOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VaultLockInput)(nil)).Elem(), &VaultLock{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultLockArrayInput)(nil)).Elem(), VaultLockArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultLockMapInput)(nil)).Elem(), VaultLockMap{})
	pulumi.RegisterOutputType(VaultLockOutput{})
	pulumi.RegisterOutputType(VaultLockArrayOutput{})
	pulumi.RegisterOutputType(VaultLockMapOutput{})
}
